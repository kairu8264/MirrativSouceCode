package com.dena.mirrativ.mirrativapi.closet;

import jo.h;

/* loaded from: classes2.dex */
public enum GameEffectType {
    None(0),
    ScoreRun(1),
    ScoreCoin(2),
    ScoreKicks(3),
    StageEnemy(4),
    ScoreSeason(5);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final GameEffectType fromInt(int i10) {
            GameEffectType gameEffectType;
            GameEffectType[] values = GameEffectType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    gameEffectType = null;
                    break;
                }
                gameEffectType = values[i11];
                if (gameEffectType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return gameEffectType == null ? GameEffectType.None : gameEffectType;
        }
    }

    GameEffectType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
