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
public class ArrayMsgIterator implements Iterator {

    private Message[] msgArray;
    private int msgIndex;

    ArrayMsgIterator(Message[] msgArr) {
        msgArray = msgArr;
    }

    @Override
    public boolean hasNext() {
        if (msgIndex < msgArray.length && msgArray[msgIndex] != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Message msg = msgArray[msgIndex];
        msgIndex++;
        return msg;
    }

}
