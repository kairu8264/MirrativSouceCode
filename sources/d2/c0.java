package d2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public interface c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29062a = a.f29063a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f29063a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final c0 f29064b = new C0270a();

        /* renamed from: d2.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0270a implements c0 {
        }

        public final c0 a() {
            return f29064b;
        }
    }

    default int a(int i10) {
        return i10;
    }

    default l b(l lVar) {
        return lVar;
    }

    default x c(x xVar) {
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        return xVar;
    }

    default int d(int i10) {
        return i10;
    }
}
