package c.service;

import c.model.MemberDTO;

/**
 * Created by Hyunjung on 2017. 10. 31..
 */

public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
