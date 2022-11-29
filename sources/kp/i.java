package kp;

import ep.b0;
import ep.v;
import java.net.Proxy;
import jo.p;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f38930a = new i();

    public final String a(b0 b0Var, Proxy.Type type) {
        p.h(b0Var, "request");
        p.h(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b0Var.g());
        sb2.append(' ');
        i iVar = f38930a;
        if (iVar.b(b0Var, type)) {
            sb2.append(b0Var.j());
        } else {
            sb2.append(iVar.c(b0Var.j()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final boolean b(b0 b0Var, Proxy.Type type) {
        return !b0Var.f() && type == Proxy.Type.HTTP;
    }

    public final String c(v vVar) {
        p.h(vVar, "url");
        String d10 = vVar.d();
        String f10 = vVar.f();
        if (f10 != null) {
            return d10 + '?' + f10;
        }
        return d10;
    }
}
