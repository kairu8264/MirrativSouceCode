package rp;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class r extends i {
    @Override // rp.i
    public f0 b(y yVar, boolean z10) {
        jo.p.h(yVar, "file");
        if (z10) {
            t(yVar);
        }
        return t.e(yVar.r(), true);
    }

    @Override // rp.i
    public void c(y yVar, y yVar2) {
        jo.p.h(yVar, "source");
        jo.p.h(yVar2, "target");
        if (yVar.r().renameTo(yVar2.r())) {
            return;
        }
        throw new IOException("failed to move " + yVar + " to " + yVar2);
    }

    @Override // rp.i
    public void g(y yVar, boolean z10) {
        jo.p.h(yVar, "dir");
        if (yVar.r().mkdir()) {
            return;
        }
        h m10 = m(yVar);
        boolean z11 = false;
        if (m10 != null && m10.f()) {
            z11 = true;
        }
        if (!z11) {
            throw new IOException(jo.p.o("failed to create directory: ", yVar));
        }
        if (z10) {
            throw new IOException(yVar + " already exist.");
        }
    }

    @Override // rp.i
    public void i(y yVar, boolean z10) {
        jo.p.h(yVar, "path");
        File r10 = yVar.r();
        if (r10.delete()) {
            return;
        }
        if (r10.exists()) {
            throw new IOException(jo.p.o("failed to delete ", yVar));
        }
        if (z10) {
            throw new FileNotFoundException(jo.p.o("no such file: ", yVar));
        }
    }

    @Override // rp.i
    public List<y> k(y yVar) {
        jo.p.h(yVar, "dir");
        List<y> r10 = r(yVar, true);
        jo.p.e(r10);
        return r10;
    }

    @Override // rp.i
    public h m(y yVar) {
        jo.p.h(yVar, "path");
        File r10 = yVar.r();
        boolean isFile = r10.isFile();
        boolean isDirectory = r10.isDirectory();
        long lastModified = r10.lastModified();
        long length = r10.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || r10.exists()) {
            return new h(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // rp.i
    public g n(y yVar) {
        jo.p.h(yVar, "file");
        return new q(false, new RandomAccessFile(yVar.r(), TopicConstant.EXTEND_AAC_RAW));
    }

    @Override // rp.i
    public f0 p(y yVar, boolean z10) {
        f0 f10;
        jo.p.h(yVar, "file");
        if (z10) {
            s(yVar);
        }
        f10 = u.f(yVar.r(), false, 1, null);
        return f10;
    }

    @Override // rp.i
    public h0 q(y yVar) {
        jo.p.h(yVar, "file");
        return t.i(yVar.r());
    }

    public final List<y> r(y yVar, boolean z10) {
        File r10 = yVar.r();
        String[] list = r10.list();
        if (list == null) {
            if (z10) {
                if (r10.exists()) {
                    throw new IOException(jo.p.o("failed to list ", yVar));
                }
                throw new FileNotFoundException(jo.p.o("no such file: ", yVar));
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            jo.p.g(str, "it");
            arrayList.add(yVar.p(str));
        }
        xn.w.w(arrayList);
        return arrayList;
    }

    public final void s(y yVar) {
        if (j(yVar)) {
            throw new IOException(yVar + " already exists.");
        }
    }

    public final void t(y yVar) {
        if (j(yVar)) {
            return;
        }
        throw new IOException(yVar + " doesn't exist.");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
