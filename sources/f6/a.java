package f6;

import j6.m;
import java.io.File;

/* loaded from: classes.dex */
public final class a implements b<File> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31810a;

    public a(boolean z10) {
        this.f31810a = z10;
    }

    @Override // f6.b
    /* renamed from: b */
    public String a(File file, m mVar) {
        if (this.f31810a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) file.getPath());
            sb2.append(':');
            sb2.append(file.lastModified());
            return sb2.toString();
        }
        return file.getPath();
    }
}
