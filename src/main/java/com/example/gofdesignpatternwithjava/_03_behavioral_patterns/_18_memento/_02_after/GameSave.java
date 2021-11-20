package com.example.gofdesignpatternwithjava._03_behavioral_patterns._18_memento._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public final class GameSave {

    private final int blueTeamScore;

    private final int redTeamScore;

}