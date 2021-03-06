package Business;

import Acquaintance.ITextMessage;

/**
 *
 * @author Group 9
 */
public class TextMessage extends Message implements ITextMessage {

    private String msg;

    public TextMessage(int senderID, String msg) {
        super(senderID);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContext() {
        return msg;
    }

}
