package ai;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class io0 extends fo0 {
    public static final Set<String> B = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat C = new DecimalFormat("#,###");
    public static final /* synthetic */ int D = 0;
    public boolean A;

    /* renamed from: z  reason: collision with root package name */
    public File f5307z;

    public io0(em0 em0Var) {
        super(em0Var);
        File cacheDir = this.f4142w.getCacheDir();
        if (cacheDir == null) {
            uj0.f("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f5307z = file;
        if (!file.isDirectory() && !this.f5307z.mkdirs()) {
            String valueOf = String.valueOf(this.f5307z.getAbsolutePath());
            uj0.f(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f5307z = null;
        } else if (this.f5307z.setReadable(true, false) && this.f5307z.setExecutable(true, false)) {
        } else {
            String valueOf2 = String.valueOf(this.f5307z.getAbsolutePath());
            uj0.f(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f5307z = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ab, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ad, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02bb, code lost:
        if (r1.length() == 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02bd, code lost:
        r11 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02c8, code lost:
        r11 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d0, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d4, code lost:
        r2 = r11;
        r1 = r14;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02dc, code lost:
        r11 = r4;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x036e, code lost:
        r26 = r4;
        r24 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0374, code lost:
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0376, code lost:
        r0 = java.lang.Long.toString(r10);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r11 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03a1, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03a2, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03a5, code lost:
        r2 = r11;
        r1 = r24;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03bd, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03c3, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03cb, code lost:
        if (ai.uj0.j(3) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03cd, code lost:
        r1 = ai.io0.C.format(r13);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r30).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r30);
        ai.uj0.a(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0403, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x040c, code lost:
        if (r0.isFile() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x040e, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0416, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04c7  */
    @Override // ai.fo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.io0.f(java.lang.String):boolean");
    }

    @Override // ai.fo0
    public final void m() {
        this.A = true;
    }

    public final File u(File file) {
        return new File(this.f5307z, String.valueOf(file.getName()).concat(".done"));
    }
}
