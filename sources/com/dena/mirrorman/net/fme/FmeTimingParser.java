package com.dena.mirrorman.net.fme;

import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import xn.a0;
import xn.o;

/* loaded from: classes2.dex */
public final class FmeTimingParser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final EventType getEventType(byte b10) {
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 12) {
                        if (b10 != 23) {
                            if (b10 != 33) {
                                if (b10 != 30) {
                                    if (b10 != 31) {
                                        switch (b10) {
                                            case 4:
                                                return EventType.SHOW_NEXT_SCREEN;
                                            case 5:
                                                return EventType.REMOVE_BLOCK;
                                            case 6:
                                                return EventType.SHOW_BLOCK;
                                            case 7:
                                                return EventType.SUB_BLOCK_CHANGE_COLOR;
                                            case 8:
                                                return EventType.SUB_BLOCK_START_CHANGE_COLOR;
                                            default:
                                                return EventType.START_CHANGE_COLOR;
                                        }
                                    }
                                    return EventType.CUT_LATE_PLAYING;
                                }
                                return EventType.START_CHORUS;
                            }
                            return EventType.END_TWO_CHORUS;
                        }
                        return EventType.CLAPPING_PLAY;
                    }
                    return EventType.CHANGE_COLOR_LOW_SPEED;
                }
                return EventType.CHANGE_COLOR_SPEED;
            }
            return EventType.START_CHANGE_COLOR;
        }

        public final List<FmeEventTiming> parse(byte[] bArr) {
            p.h(bArr, "bytes");
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (!(!(bArr.length == 0))) {
                    return arrayList;
                }
                int parseIntFromBytes = FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 0, 4));
                byte b10 = FmeParserKt.getBytes(bArr, 4, 1)[0];
                EventType eventType = FmeTimingParser.Companion.getEventType(FmeParserKt.getBytes(bArr, 5, 1)[0]);
                byte[] bArr2 = new byte[0];
                if (b10 != 1) {
                    bArr2 = FmeParserKt.getBytes(bArr, 6, b10 - 1);
                }
                arrayList.add(new FmeEventTiming(parseIntFromBytes, b10, eventType, bArr2));
                bArr = a0.x0(o.C(bArr, 0 + b10 + 5));
            }
        }
    }
}
