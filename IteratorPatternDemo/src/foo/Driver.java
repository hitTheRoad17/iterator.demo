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
public class Driver {

    public static void main(String args[]) {
        ArrayMsgCollection mc = new ArrayMsgCollection();
        MsgCenter mct = new MsgCenter(mc);
        mct.printAllMsgs();
    }
    
}
