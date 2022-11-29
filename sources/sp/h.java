package sp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import jo.p;
import rp.y;
import xn.k;

/* loaded from: classes4.dex */
public final class h {
    public static final void a(rp.i iVar, y yVar, boolean z10) throws IOException {
        p.h(iVar, "<this>");
        p.h(yVar, "dir");
        k kVar = new k();
        for (y yVar2 = yVar; yVar2 != null && !iVar.j(yVar2); yVar2 = yVar2.n()) {
            kVar.g(yVar2);
        }
        if (z10 && kVar.isEmpty()) {
            throw new IOException(yVar + " already exist.");
        }
        Iterator<E> it = kVar.iterator();
        while (it.hasNext()) {
            iVar.f((y) it.next());
        }
    }

    public static final boolean b(rp.i iVar, y yVar) throws IOException {
        p.h(iVar, "<this>");
        p.h(yVar, "path");
        return iVar.m(yVar) != null;
    }

    public static final rp.h c(rp.i iVar, y yVar) throws IOException {
        p.h(iVar, "<this>");
        p.h(yVar, "path");
        rp.h m10 = iVar.m(yVar);
        if (m10 != null) {
            return m10;
        }
        throw new FileNotFoundException(p.o("no such file: ", yVar));
    }
}
