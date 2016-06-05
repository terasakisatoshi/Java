# Java
* this is my study note about java
how to compile...
* If there are three source files A.java,B.java and Main.java, open terminal and change directory which above files exist.
then
```
#compile
javac A.java B.java Main.java
#execute
java Main
```
# Iterator パターンにつて
* Iterator パターンとは，何かたくさん集まっている時に，
それを順番に指し示して，全体をスキャンしていく処理を行うもの．
* iterator は日本語では反復子と呼ばれることがある．

＃Adapter　パターンについて
* 継承と委譲を用いたパターンが存在するようだ．
* 正直使いどころがピンとこないので先に進みます．

#Template Method パターン
* super class で処理の枠組みを定め，サブクラスでその具体的な内容を定めるようなパターンを
 Template Method　パターンという．
* 処理の骨組みをスーパークラスで記述し，具体的には，肉付けをサブクラスで行っています．
どのレベルで処理を分けるか，どの処理をスーパークラスに起き，どの処理をサブクラスに置くかについては
定まったマニュアルはない．プログラム設計者に任されている．
