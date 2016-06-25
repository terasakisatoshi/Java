package utility;
import javax.swing.*;
import javax.swing.event.*;

/**
QuickEntryMediatorはJTextFieldとJListを受けとる．
userが文字をJTextFieldに打ち込むことを仮定している．
JTextFieldに打ち込まれた頭文字に一致するJListの最初の要素を自動的に見つけ出す．
JTextFieldがnullだったり，打ち込まれた文字列がJListに登録されていない場合は，JListの選択肢はクリアされる．
このオブジェクトを呼び出すメソッドは存在しない．
オブジェクトを作成した後は忘れてしまって良い．ただしガベージコレクションを忘れずに．

example

JTextField t = new JTextField();
JList l = new JList();
QuickEntryMediator qem = new QuickEntryMediator(t,l);
//that is  all
*/

public class QuickEntryMediator {
    public QuickEntryMediator(JTextField t, JList l){
        itsTextField=t;
        itsList=l;
        itsTextField.getDocument().addDocumentListener(
            new DocumentListener(){
                public void ChangedUpdate(DocumentEvent e){
                    textFieldChanged();
                }
                public void insertUpdate(DocumentEvent e){
                    textFieldChanged();
                }
                public void removeUpdate(DocumentEvent e){
                    textFieldChanged();
                }
            }
        );
    }

    private void textFieldChanged(){
        String prefix = itsTextField.getText();
        if(prefix.length() == 0 ){
            itsList.clearSelection();
            return;
        }
        ListModel m = itsList.getModel();
        boolean found =false;
        for(int i=0;found==false && i<m.getSize();++i){
            Object o=m.getElementAt(i);
            String s=o.toString();
            if(s.startsWith(prefix)){
                itsList.setSelectedValue(o,true);
                found=true;
            }
        }
        if(!found){
            itsList.clearSelection();
        }
    }
    private JTextField itsTextField;
    private JList itsList;
}