package f3;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<n3.d<Rect, Rect>> f31717a = new ThreadLocal<>();

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText(TopicConstant.PACKET_TYPE_META);
        float measureText3 = paint.measureText(str);
        float f10 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i10 = 0;
            while (i10 < length) {
                int charCount = Character.charCount(str.codePointAt(i10)) + i10;
                f10 += paint.measureText(str, i10, charCount);
                i10 = charCount;
            }
            if (measureText3 >= f10) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        n3.d<Rect, Rect> b10 = b();
        paint.getTextBounds("\udfffd", 0, 2, b10.f41559a);
        paint.getTextBounds(str, 0, length, b10.f41560b);
        return !b10.f41559a.equals(b10.f41560b);
    }

    public static n3.d<Rect, Rect> b() {
        ThreadLocal<n3.d<Rect, Rect>> threadLocal = f31717a;
        n3.d<Rect, Rect> dVar = threadLocal.get();
        if (dVar == null) {
            n3.d<Rect, Rect> dVar2 = new n3.d<>(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        dVar.f41559a.setEmpty();
        dVar.f41560b.setEmpty();
        return dVar;
    }
}
