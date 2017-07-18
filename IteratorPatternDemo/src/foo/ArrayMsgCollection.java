/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo;

/**
 *
 * @author hye
 */
public class ArrayMsgCollection implements Collection {

    private final int MSG_CAPACITY = 100;
    private int msgCount;
    private Message[] msgArray;

    ArrayMsgCollection() {
        msgArray = new Message[MSG_CAPACITY];
        msgCount = 0;

        addMsg("Hit the road Jack");
        addMsg("Don't you come back no more");
        addMsg("no more, no more, no more");
        addMsg("Hit the road Jack");
        addMsg("Don't you come back no more");

    }

    private void addMsg(String str) {
        Message msg = new Message(str);
        if (msgCount >= MSG_CAPACITY) {
            System.out.println("No more space for message");
        } else {
            msgArray[msgCount] = msg;
            msgCount++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ArrayMsgIterator(msgArray);
    }

}
