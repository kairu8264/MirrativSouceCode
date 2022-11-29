package rp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class j extends i {

    /* renamed from: e  reason: collision with root package name */
    public final i f51705e;

    public j(i iVar) {
        jo.p.h(iVar, "delegate");
        this.f51705e = iVar;
    }

    @Override // rp.i
    public f0 b(y yVar, boolean z10) throws IOException {
        jo.p.h(yVar, "file");
        return this.f51705e.b(r(yVar, "appendingSink", "file"), z10);
    }

    @Override // rp.i
    public void c(y yVar, y yVar2) throws IOException {
        jo.p.h(yVar, "source");
        jo.p.h(yVar2, "target");
        this.f51705e.c(r(yVar, "atomicMove", "source"), r(yVar2, "atomicMove", "target"));
    }

    @Override // rp.i
    public void g(y yVar, boolean z10) throws IOException {
        jo.p.h(yVar, "dir");
        this.f51705e.g(r(yVar, "createDirectory", "dir"), z10);
    }

    @Override // rp.i
    public void i(y yVar, boolean z10) throws IOException {
        jo.p.h(yVar, "path");
        this.f51705e.i(r(yVar, "delete", "path"), z10);
    }

    @Override // rp.i
    public List<y> k(y yVar) throws IOException {
        jo.p.h(yVar, "dir");
        List<y> k10 = this.f51705e.k(r(yVar, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        for (y yVar2 : k10) {
            arrayList.add(s(yVar2, "list"));
        }
        xn.w.w(arrayList);
        return arrayList;
    }

    @Override // rp.i
    public h m(y yVar) throws IOException {
        h a10;
        jo.p.h(yVar, "path");
        h m10 = this.f51705e.m(r(yVar, "metadataOrNull", "path"));
        if (m10 == null) {
            return null;
        }
        if (m10.e() == null) {
            return m10;
        }
        a10 = m10.a((r18 & 1) != 0 ? m10.f51688a : false, (r18 & 2) != 0 ? m10.f51689b : false, (r18 & 4) != 0 ? m10.f51690c : s(m10.e(), "metadataOrNull"), (r18 & 8) != 0 ? m10.f51691d : null, (r18 & 16) != 0 ? m10.f51692e : null, (r18 & 32) != 0 ? m10.f51693f : null, (r18 & 64) != 0 ? m10.f51694g : null, (r18 & 128) != 0 ? m10.f51695h : null);
        return a10;
    }

    @Override // rp.i
    public g n(y yVar) throws IOException {
        jo.p.h(yVar, "file");
        return this.f51705e.n(r(yVar, "openReadOnly", "file"));
    }

    @Override // rp.i
    public f0 p(y yVar, boolean z10) throws IOException {
        jo.p.h(yVar, "file");
        return this.f51705e.p(r(yVar, "sink", "file"), z10);
    }

    @Override // rp.i
    public h0 q(y yVar) throws IOException {
        jo.p.h(yVar, "file");
        return this.f51705e.q(r(yVar, "source", "file"));
    }

    public y r(y yVar, String str, String str2) {
        jo.p.h(yVar, "path");
        jo.p.h(str, "functionName");
        jo.p.h(str2, "parameterName");
        return yVar;
    }

    public y s(y yVar, String str) {
        jo.p.h(yVar, "path");
        jo.p.h(str, "functionName");
        return yVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) jo.f0.b(getClass()).c());
        sb2.append('(');
        sb2.append(this.f51705e);
        sb2.append(')');
        return sb2.toString();
    }
}
