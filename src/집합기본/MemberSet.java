package 집합기본;

public class MemberSet {
    int id;
    String name;

    public MemberSet(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MemberSet) {  // 다운 캐스팅을 위해서 원래 클래스 타입을 확인
            MemberSet member = (MemberSet) obj;  // 원래의 타입으로 형 변환
            if (this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + "]";
    }
}
