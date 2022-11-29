package d7;

import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29237a = c.a.a(TopicConstant.EXTEND_LIPMETA_A, TtmlNode.TAG_P, "s", "rz", TopicConstant.EXTEND_AAC_RAW, "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29238b = c.a.a("k");

    public static boolean a(z6.e eVar) {
        return eVar == null || (eVar.c() && eVar.b().get(0).f32797b.equals(0.0f, 0.0f));
    }

    public static boolean b(z6.m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof z6.i) && mVar.c() && mVar.b().get(0).f32797b.equals(0.0f, 0.0f));
    }

    public static boolean c(z6.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((g7.a) bVar.b().get(0)).f32797b).floatValue() == 0.0f);
    }

    public static boolean d(z6.g gVar) {
        return gVar == null || (gVar.c() && ((g7.d) ((g7.a) gVar.b().get(0)).f32797b).a(1.0f, 1.0f));
    }

    public static boolean e(z6.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((g7.a) bVar.b().get(0)).f32797b).floatValue() == 0.0f);
    }

    public static boolean f(z6.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((g7.a) bVar.b().get(0)).f32797b).floatValue() == 0.0f);
    }

    public static z6.l g(e7.c cVar, s6.d dVar) throws IOException {
        boolean z10;
        boolean z11 = false;
        boolean z12 = cVar.z() == c.b.BEGIN_OBJECT;
        if (z12) {
            cVar.d();
        }
        z6.b bVar = null;
        z6.e eVar = null;
        z6.m<PointF, PointF> mVar = null;
        z6.g gVar = null;
        z6.b bVar2 = null;
        z6.b bVar3 = null;
        z6.d dVar2 = null;
        z6.b bVar4 = null;
        z6.b bVar5 = null;
        while (cVar.i()) {
            switch (cVar.E(f29237a)) {
                case 0:
                    boolean z13 = z11;
                    cVar.d();
                    while (cVar.i()) {
                        if (cVar.E(f29238b) != 0) {
                            cVar.F();
                            cVar.G();
                        } else {
                            eVar = a.a(cVar, dVar);
                        }
                    }
                    cVar.h();
                    z11 = z13;
                    continue;
                case 1:
                    mVar = a.b(cVar, dVar);
                    continue;
                case 2:
                    gVar = d.j(cVar, dVar);
                    continue;
                case 3:
                    dVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar2 = d.h(cVar, dVar);
                    continue;
                case 6:
                    bVar4 = d.f(cVar, dVar, z11);
                    continue;
                case 7:
                    bVar5 = d.f(cVar, dVar, z11);
                    continue;
                case 8:
                    bVar2 = d.f(cVar, dVar, z11);
                    continue;
                case 9:
                    bVar3 = d.f(cVar, dVar, z11);
                    continue;
                default:
                    cVar.F();
                    cVar.G();
                    continue;
            }
            z6.b f10 = d.f(cVar, dVar, z11);
            if (f10.b().isEmpty()) {
                f10.b().add(new g7.a(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(dVar.f())));
            } else if (((g7.a) f10.b().get(0)).f32797b == 0) {
                z10 = false;
                f10.b().set(0, new g7.a(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(dVar.f())));
                z11 = z10;
                bVar = f10;
            }
            z10 = false;
            z11 = z10;
            bVar = f10;
        }
        if (z12) {
            cVar.h();
        }
        z6.e eVar2 = a(eVar) ? null : eVar;
        z6.m<PointF, PointF> mVar2 = b(mVar) ? null : mVar;
        z6.b bVar6 = c(bVar) ? null : bVar;
        if (d(gVar)) {
            gVar = null;
        }
        return new z6.l(eVar2, mVar2, gVar, bVar6, dVar2, bVar4, bVar5, f(bVar2) ? null : bVar2, e(bVar3) ? null : bVar3);
    }
}
