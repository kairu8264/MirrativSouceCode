package d7;

import android.graphics.Color;
import android.graphics.Rect;
import b7.e;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29288a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", TopicConstant.PACKET_TYPE_TEXT, "ef", "sr", "st", "w", "h", "ip", TopicConstant.EVENT_TYPE_OPERATION, "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29289b = c.a.a("d", TopicConstant.EXTEND_LIPMETA_A);

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f29290c = c.a.a("ty", "nm");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29291a;

        static {
            int[] iArr = new int[e.b.values().length];
            f29291a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29291a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static b7.e a(e7.c cVar, s6.d dVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f10;
        e.b bVar = e.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.d();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        e.b bVar2 = bVar;
        float f11 = 1.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        e.a aVar = null;
        String str = null;
        z6.l lVar = null;
        z6.j jVar = null;
        z6.k kVar = null;
        z6.b bVar3 = null;
        a7.a aVar2 = null;
        j jVar2 = null;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        long j10 = -1;
        long j11 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (cVar.i()) {
            switch (cVar.E(f29288a)) {
                case 0:
                    str3 = cVar.q();
                    break;
                case 1:
                    j11 = cVar.o();
                    break;
                case 2:
                    str = cVar.q();
                    break;
                case 3:
                    int o10 = cVar.o();
                    aVar = e.a.UNKNOWN;
                    if (o10 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[o10];
                        break;
                    }
                case 4:
                    j10 = cVar.o();
                    break;
                case 5:
                    i10 = (int) (cVar.o() * f7.h.e());
                    break;
                case 6:
                    i11 = (int) (cVar.o() * f7.h.e());
                    break;
                case 7:
                    i12 = Color.parseColor(cVar.q());
                    break;
                case 8:
                    lVar = c.g(cVar, dVar);
                    break;
                case 9:
                    int o11 = cVar.o();
                    if (o11 >= e.b.values().length) {
                        dVar.a("Unsupported matte type: " + o11);
                        break;
                    } else {
                        bVar2 = e.b.values()[o11];
                        int i15 = a.f29291a[bVar2.ordinal()];
                        if (i15 == 1) {
                            dVar.a("Unsupported matte type: Luma");
                        } else if (i15 == 2) {
                            dVar.a("Unsupported matte type: Luma Inverted");
                        }
                        dVar.s(1);
                        break;
                    }
                case 10:
                    cVar.c();
                    while (cVar.i()) {
                        arrayList3.add(x.a(cVar, dVar));
                    }
                    dVar.s(arrayList3.size());
                    cVar.e();
                    break;
                case 11:
                    cVar.c();
                    while (cVar.i()) {
                        a7.c a10 = h.a(cVar, dVar);
                        if (a10 != null) {
                            arrayList4.add(a10);
                        }
                    }
                    cVar.e();
                    break;
                case 12:
                    cVar.d();
                    while (cVar.i()) {
                        int E = cVar.E(f29289b);
                        if (E == 0) {
                            jVar = d.d(cVar, dVar);
                        } else if (E != 1) {
                            cVar.F();
                            cVar.G();
                        } else {
                            cVar.c();
                            if (cVar.i()) {
                                kVar = b.a(cVar, dVar);
                            }
                            while (cVar.i()) {
                                cVar.G();
                            }
                            cVar.e();
                        }
                    }
                    cVar.h();
                    break;
                case 13:
                    cVar.c();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.i()) {
                        cVar.d();
                        while (cVar.i()) {
                            int E2 = cVar.E(f29290c);
                            if (E2 == 0) {
                                int o12 = cVar.o();
                                if (o12 == 29) {
                                    aVar2 = e.b(cVar, dVar);
                                } else if (o12 == 25) {
                                    jVar2 = new k().b(cVar, dVar);
                                }
                            } else if (E2 != 1) {
                                cVar.F();
                                cVar.G();
                            } else {
                                arrayList5.add(cVar.q());
                            }
                        }
                        cVar.h();
                    }
                    cVar.e();
                    dVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f11 = (float) cVar.n();
                    break;
                case 15:
                    f13 = (float) cVar.n();
                    break;
                case 16:
                    i13 = (int) (cVar.o() * f7.h.e());
                    break;
                case 17:
                    i14 = (int) (cVar.o() * f7.h.e());
                    break;
                case 18:
                    f12 = (float) cVar.n();
                    break;
                case 19:
                    f14 = (float) cVar.n();
                    break;
                case 20:
                    bVar3 = d.f(cVar, dVar, false);
                    break;
                case 21:
                    str2 = cVar.q();
                    break;
                case 22:
                    z10 = cVar.j();
                    break;
                default:
                    cVar.F();
                    cVar.G();
                    break;
            }
        }
        cVar.h();
        ArrayList arrayList6 = new ArrayList();
        if (f12 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new g7.a(dVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f12)));
            f10 = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f10 = 0.0f;
        }
        if (f14 <= f10) {
            f14 = dVar.f();
        }
        arrayList2.add(new g7.a(dVar, valueOf, valueOf, null, f12, Float.valueOf(f14)));
        arrayList2.add(new g7.a(dVar, valueOf2, valueOf2, null, f14, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            dVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new b7.e(arrayList4, dVar, str3, j11, aVar, j10, str, arrayList, lVar, i10, i11, i12, f11, f13, i13, i14, jVar, kVar, arrayList2, bVar2, bVar3, z10, aVar2, jVar2);
    }

    public static b7.e b(s6.d dVar) {
        Rect b10 = dVar.b();
        return new b7.e(Collections.emptyList(), dVar, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new z6.l(), 0, 0, 0, 0.0f, 0.0f, b10.width(), b10.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null);
    }
}
