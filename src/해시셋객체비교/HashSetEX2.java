package 해시셋객체비교;




import java.util.HashSet;

public class HashSetEX2 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        Member member4 = new Member(1003, "카리나");
        //중복이 아님, 인스턴스 주소가 달라서 hashCODE가 다름
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
        for (Member e : hashSet) e.showMember();
    }
}




//        HashSet<Member> hashSet = new HashSet<>();
//        Member member1 = new Member(1001, "유나");
//        Member member2 = new Member(1002, "채원");
//        Member member3 = new Member(1003, "지수");
//        hashSet.add(member1);
//        hashSet.add(member2);
//        hashSet.add(member3);
//        hashSet.add(member4);
//        hashSet.add(new Member(1003, "카리나"));
//        //new를 통해 객체를 다르게 만들었으므로, 주소가 다르다고 판단하여 중복으로 취급x
//        for (Member e : hashSet) e.showMember();
//    }
//
//}


class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) { //다운캐스팅이 성립하는지 확인하기 위한 조건
            Member member = (Member) obj; // 원래 형으로 형변환
            if (this.id == member.id) return true; // id가 같으면 중복이라고 판별
            else  return  false;
    }
      return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + name);
    }

}

