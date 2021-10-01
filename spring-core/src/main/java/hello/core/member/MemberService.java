package hello.core.member;

/**
 * @author JeongJoon Seo
 */
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
