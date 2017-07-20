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
public class MsgCenter {

    private ArrayMsgCollection msgs;

    MsgCenter(ArrayMsgCollection mc) {
        msgs = mc;
    }
    
    // ArrayMsgCollection provides an iterator to iterate over its collection
    // without exposing how it was implemented the collection
    public void printAllMsgs() {
        Iterator i = msgs.createIterator();
        System.out.println("*******Message*******");
        while (i.hasNext()) {
            Message m = (Message) i.next();
            System.out.println(m.getMsg());
        }
    }
    
}
