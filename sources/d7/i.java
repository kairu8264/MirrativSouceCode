package d7;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import y6.b;

/* loaded from: classes.dex */
public class i implements m0<y6.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final i f29251a = new i();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29252b = c.a.a(TopicConstant.PACKET_TYPE_TEXT, "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // d7.m0
    /* renamed from: b */
    public y6.b a(e7.c cVar, float f10) throws IOException {
        b.a aVar = b.a.CENTER;
        cVar.d();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        boolean z10 = true;
        while (cVar.i()) {
            switch (cVar.E(f29252b)) {
                case 0:
                    str = cVar.q();
                    break;
                case 1:
                    str2 = cVar.q();
                    break;
                case 2:
                    f11 = (float) cVar.n();
                    break;
                case 3:
                    int o10 = cVar.o();
                    aVar2 = b.a.CENTER;
                    if (o10 <= aVar2.ordinal() && o10 >= 0) {
                        aVar2 = b.a.values()[o10];
                        break;
                    }
                    break;
                case 4:
                    i10 = cVar.o();
                    break;
                case 5:
                    f12 = (float) cVar.n();
                    break;
                case 6:
                    f13 = (float) cVar.n();
                    break;
                case 7:
                    i11 = s.d(cVar);
                    break;
                case 8:
                    i12 = s.d(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.n();
                    break;
                case 10:
                    z10 = cVar.j();
                    break;
                default:
                    cVar.F();
                    cVar.G();
                    break;
            }
        }
        cVar.h();
        return new y6.b(str, str2, f11, aVar2, i10, f12, f13, i11, i12, f14, z10);
    }
}
