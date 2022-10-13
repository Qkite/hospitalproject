package com.seoulhospital.parser;

public interface Parser<T> {

    T parse(String str); // T를 return 하도록 만들어 주어야 함 -> 다양한 object에 대해서 적용
}
