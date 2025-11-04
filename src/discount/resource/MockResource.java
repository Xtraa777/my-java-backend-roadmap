package discount.resource;

public class MockResource implements AutoCloseable {

    public MockResource() {
        System.out.println("MockResource: 가상 자원 연결됨");
    }

    @Override
    public void close() throws Exception {
        System.out.println("MockResource: 리소스 정리 완료");
    }
}
