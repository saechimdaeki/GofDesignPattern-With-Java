package com.example.gofdesignpatternwithjava._02_structural_patterns._11_flyweight._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;

//flyweight에 해당하는 클래스
@Getter @AllArgsConstructor
public final class Font {
    String family;
    int size;

}
