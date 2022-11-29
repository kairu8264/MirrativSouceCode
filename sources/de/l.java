package de;

import java.text.BreakIterator;
import jo.p;

/* loaded from: classes2.dex */
public final class l {
    public static final int a(String str) {
        p.h(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int i10 = 0;
        while (characterInstance.next() != -1) {
            i10++;
        }
        return i10;
    }
}
