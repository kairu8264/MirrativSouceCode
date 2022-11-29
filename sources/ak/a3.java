package ak;

import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a3 {

    /* renamed from: b  reason: collision with root package name */
    public static final dk.f f13309b = new dk.f("MergeSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final o0 f13310a;

    public a3(o0 o0Var) {
        this.f13310a = o0Var;
    }

    public static void b(File file, File file2) {
        File[] listFiles;
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (file.delete()) {
                return;
            }
            String valueOf = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
            sb2.append("Unable to delete directory: ");
            sb2.append(valueOf);
            throw new p1(sb2.toString());
        } else if (!file2.exists()) {
            if (file.renameTo(file2)) {
                return;
            }
            String valueOf2 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf2);
            throw new p1(sb3.toString());
        } else {
            String valueOf3 = String.valueOf(file2);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 51);
            sb4.append("File clashing with existing file from other slice: ");
            sb4.append(valueOf3);
            throw new p1(sb4.toString());
        }
    }

    public final void a(z2 z2Var) {
        File E = this.f13310a.E(z2Var.f13533b, z2Var.f13735c, z2Var.f13736d, z2Var.f13737e);
        if (E.exists()) {
            File x10 = this.f13310a.x(z2Var.f13533b, z2Var.f13735c, z2Var.f13736d);
            if (!x10.exists()) {
                x10.mkdirs();
            }
            b(E, x10);
            try {
                this.f13310a.a(z2Var.f13533b, z2Var.f13735c, z2Var.f13736d, this.f13310a.r(z2Var.f13533b, z2Var.f13735c, z2Var.f13736d) + 1);
                return;
            } catch (IOException e10) {
                f13309b.b("Writing merge checkpoint failed with %s.", e10.getMessage());
                throw new p1("Writing merge checkpoint failed.", e10, z2Var.f13532a);
            }
        }
        throw new p1(String.format("Cannot find verified files for slice %s.", z2Var.f13737e), z2Var.f13532a);
    }
}
