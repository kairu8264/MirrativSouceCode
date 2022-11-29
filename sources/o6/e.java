package o6;

import java.io.FileNotFoundException;
import java.io.IOException;
import rp.y;

/* loaded from: classes.dex */
public final class e {
    public static final void a(rp.i iVar, y yVar) {
        if (iVar.j(yVar)) {
            return;
        }
        k.c(iVar.o(yVar));
    }

    public static final void b(rp.i iVar, y yVar) {
        try {
            IOException iOException = null;
            for (y yVar2 : iVar.k(yVar)) {
                try {
                    if (iVar.l(yVar2).f()) {
                        b(iVar, yVar2);
                    }
                    iVar.h(yVar2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
