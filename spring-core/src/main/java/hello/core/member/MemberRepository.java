package hello.core.member;

/**
 * @author JeongJoon Seo
 */
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
