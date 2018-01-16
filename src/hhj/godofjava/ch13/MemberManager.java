package hhj.godofjava.ch13;

/**
 * Created by Hyunjung on 2018. 1. 15..
 */

public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
