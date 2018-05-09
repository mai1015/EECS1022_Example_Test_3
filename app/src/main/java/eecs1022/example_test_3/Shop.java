package eecs1022.example_test_3;

class Shop {
    static final int MAX_MEMBER = 100;
    Member[] members = new Member[MAX_MEMBER];
    int pos = 0;

    public Member[] getMembers() {
        Member[] m = new Member[pos];
        for (int i = 0; i < pos; i++) {
            m[i] = members[i];
        }
        return m;
    }

    public void addMember(Member members) {
        this.members[pos] = members;
        pos++;
    }

//    public String hasMember(String id) {
//        for (int i = 0; i <= pos; i++) {
//            if ()
//        }
//        return null;
//    }

    public boolean hasMember(String mem) {
        for (int i = 0; i < pos; i++) {
            if (members[i].id.equals(mem)) {
                return true;
            }
        }
        return false;
    }

    public void checkOut(String mem) {
        for (int i = 0; i < pos; i++) {
            if (members[i].id.equals(mem)) {
                members[i].pay();
            }
        }
    }
}
