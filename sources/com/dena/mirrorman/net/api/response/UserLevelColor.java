package com.dena.mirrorman.net.api.response;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import so.o;
import xn.a0;
import xn.t;

/* loaded from: classes2.dex */
public interface UserLevelColor {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static int getLevelBorderColor(UserLevelColor userLevelColor) {
            String str;
            try {
                if (o.H(userLevelColor.getLevelBorderColorCode(), "#", false, 2, null)) {
                    str = userLevelColor.getLevelBorderColorCode();
                } else {
                    str = '#' + userLevelColor.getLevelBorderColorCode();
                }
                return Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                return -16777216;
            }
        }

        public static int getLevelColor(UserLevelColor userLevelColor) {
            String str;
            try {
                if (o.H(userLevelColor.getLevelColorCode(), "#", false, 2, null)) {
                    str = userLevelColor.getLevelColorCode();
                } else {
                    str = '#' + userLevelColor.getLevelColorCode();
                }
                return Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                return -16777216;
            }
        }

        public static int[] getLevelGaugeColors(UserLevelColor userLevelColor) {
            try {
                List<String> levelGaugeColorCodes = userLevelColor.getLevelGaugeColorCodes();
                ArrayList arrayList = new ArrayList(t.u(levelGaugeColorCodes, 10));
                for (String str : levelGaugeColorCodes) {
                    if (!o.H(str, "#", false, 2, null)) {
                        str = '#' + str;
                    }
                    arrayList.add(Integer.valueOf(Color.parseColor(str)));
                }
                return a0.A0(arrayList);
            } catch (IllegalArgumentException unused) {
                return new int[]{Color.parseColor("#29CCB1"), Color.parseColor("#29CCB1"), Color.parseColor("#29CCB1")};
            }
        }
    }

    int getLevelBorderColor();

    String getLevelBorderColorCode();

    int getLevelColor();

    String getLevelColorCode();

    List<String> getLevelGaugeColorCodes();

    int[] getLevelGaugeColors();
}
