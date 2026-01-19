package org.example.Head05_AlgoAndDataStructure.topic03_GenericTypeAndMethod.example07_GenericCollectionWrapper;

import java.util.ArrayList;
import java.util.List;

// 빈 문자열을 허용하지 않는 특수한 String 리스트
public class NonEmptyStringList {
    // 내부 저장소, private 으로 캡슐화
    private final List<String> internal = new ArrayList<>();

    // 이 래퍼는 "비어있지 않은 문자열만" 저장할 수 있는 특수한 리스트
    public void add(String element) {
        // 예: 길이가 0이면 안 된다거나, 특정 패턴만 허용하기
        if (element == null || element.isEmpty()) {
            throw new IllegalArgumentException("빈 문자열은 허용되지 않습니다");
        }

        // 추가 검증 가능: 100자 초과 불가
        // 로깅 작성

        internal.add(element);
    }

    public String get(int index) {
        return internal.get(index);
    }

    public List<String> getInternal() {
        return internal;
    }

    public int size() {
        return internal.size();
    }

    // 기타 확장 기능...
}
