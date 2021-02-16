public class TestUserService{

    @Test
    public void correctChange(){
        assertTrue(UserService.changePassword("Hlias123","somebigPasswordToPass"));
    }

    @Test
    public void changeFailure(){
        assertFalse(UserService.changePassword("Hlias123","");)
    }
}