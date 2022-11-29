package com.dena.showroom.flvplayback.impl.util;

import android.util.Log;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes3.dex */
public final class Bytes {
    public static void dumpHex(byte[] bArr) {
        dumpHex(bArr, 16);
    }

    public static void dumpHex(byte[] bArr, int i10) {
        String str = "dump\n\n";
        int i11 = 0;
        while (i11 < bArr.length) {
            String str2 = "";
            String str3 = "";
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 + i11;
                if (i13 < bArr.length) {
                    int i14 = bArr[i13] & TagConstant.TAG_CAT_RESERVED;
                    str2 = str2 + String.format(" %02x", Integer.valueOf(i14));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(Character.isISOControl(i14) ? TopicConstant.SEPARATOR : Character.valueOf((char) i14));
                    str3 = sb2.toString();
                }
            }
            str = str + str2 + " | " + str3 + "\n";
            i11 += i10;
        }
        Log.d("bin", str);
    }
}
