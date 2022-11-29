package hi;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t9 extends n {

    /* renamed from: x  reason: collision with root package name */
    public final c f36000x;

    public t9(c cVar) {
        this.f36000x = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // hi.n, hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        char c10;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            v5.h("getEventName", 0, list);
            return new u(this.f36000x.b().d());
        } else if (c10 == 1) {
            v5.h("getParamValue", 1, list);
            return w6.b(this.f36000x.b().c(u4Var.b(list.get(0)).h()));
        } else if (c10 == 2) {
            v5.h("getParams", 0, list);
            Map<String, Object> e10 = this.f36000x.b().e();
            n nVar = new n();
            for (String str2 : e10.keySet()) {
                nVar.k(str2, w6.b(e10.get(str2)));
            }
            return nVar;
        } else if (c10 == 3) {
            v5.h("getTimestamp", 0, list);
            return new i(Double.valueOf(this.f36000x.b().a()));
        } else if (c10 != 4) {
            if (c10 != 5) {
                return super.l(str, u4Var, list);
            }
            v5.h("setParamValue", 2, list);
            String h10 = u4Var.b(list.get(0)).h();
            q b10 = u4Var.b(list.get(1));
            this.f36000x.b().g(h10, v5.f(b10));
            return b10;
        } else {
            v5.h("setEventName", 1, list);
            q b11 = u4Var.b(list.get(0));
            if (!q.f35921f.equals(b11) && !q.f35922g.equals(b11)) {
                this.f36000x.b().f(b11.h());
                return new u(b11.h());
            }
            throw new IllegalArgumentException("Illegal event name");
        }
    }
}
