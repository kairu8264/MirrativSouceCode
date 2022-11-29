package d2;

import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class g0 {
    public static final d0 a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new e0();
        }
        return new f0();
    }

    public static final String b(String str, x xVar) {
        jo.p.h(str, "name");
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        int r10 = xVar.r() / 100;
        boolean z10 = true;
        if (r10 >= 0 && r10 < 2) {
            return str + "-thin";
        }
        if (2 <= r10 && r10 < 4) {
            return str + "-light";
        } else if (r10 == 4) {
            return str;
        } else {
            if (r10 == 5) {
                return str + "-medium";
            }
            if (6 <= r10 && r10 < 8) {
                return str;
            }
            if (8 > r10 || r10 >= 11) {
                z10 = false;
            }
            if (z10) {
                return str + "-black";
            }
            return str;
        }
    }
}
