package example.micronaut.service1;

import jakarta.inject.Singleton;

@Singleton
public class MathServiceImpl implements MathService {

    @Override
    public Integer compute(Integer num) {
        return num * 4;
    }
}
