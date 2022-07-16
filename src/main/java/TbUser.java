import java.io.Serializable;

/**
 * 
 * @TableName tb_user
 */
public class TbUser implements Serializable {
    /**
     * 
     */
    private Integer userid;

    /**
     * 
     */
    private String uname;

    /**
     * 
     */
    private String upwd;

    /**
     * 
     */
    private String nick;

    /**
     * 
     */
    private String head;

    /**
     * 
     */
    private String mood;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 
     */
    public String getUname() {
        return uname;
    }

    /**
     * 
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * 
     */
    public String getUpwd() {
        return upwd;
    }

    /**
     * 
     */
    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    /**
     * 
     */
    public String getNick() {
        return nick;
    }

    /**
     * 
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 
     */
    public String getHead() {
        return head;
    }

    /**
     * 
     */
    public void setHead(String head) {
        this.head = head;
    }

    /**
     * 
     */
    public String getMood() {
        return mood;
    }

    /**
     * 
     */
    public void setMood(String mood) {
        this.mood = mood;
    }
}