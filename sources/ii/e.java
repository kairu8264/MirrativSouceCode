package ii;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: classes3.dex */
public final class e {
    public static String a(Context context, c cVar) {
        long e10 = cVar.e();
        int h10 = cVar.h();
        String a10 = cVar.a();
        if (a10.isEmpty()) {
            return b(context, "third_party_licenses", e10, h10);
        }
        String d10 = d("res/raw/third_party_licenses", a10, e10, h10);
        if (d10 != null) {
            return d10;
        }
        StringBuilder sb2 = new StringBuilder(a10.length() + 46);
        sb2.append(a10);
        sb2.append(" does not contain res/raw/third_party_licenses");
        throw new RuntimeException(sb2.toString());
    }

    public static String b(Context context, String str, long j10, int i10) {
        Resources resources = context.getApplicationContext().getResources();
        return c(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(f.f36832a))), j10, i10);
    }

    public static String c(InputStream inputStream, long j10, int i10) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j10);
            if (i10 <= 0) {
                i10 = Integer.MAX_VALUE;
            }
            while (i10 > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i10, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i10 -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString(C.UTF8_NAME);
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e10);
            }
        } catch (IOException e11) {
            throw new RuntimeException("Failed to read license or metadata text.", e11);
        }
    }

    public static String d(String str, String str2, long j10, int i10) {
        JarFile jarFile = null;
        try {
            try {
                JarFile jarFile2 = new JarFile(str2);
                try {
                    JarEntry jarEntry = jarFile2.getJarEntry(str);
                    if (jarEntry == null) {
                        try {
                            jarFile2.close();
                        } catch (IOException unused) {
                        }
                        return null;
                    }
                    String c10 = c(jarFile2.getInputStream(jarEntry), j10, i10);
                    try {
                        jarFile2.close();
                    } catch (IOException unused2) {
                    }
                    return c10;
                } catch (IOException e10) {
                    e = e10;
                    throw new RuntimeException("Failed to read license text.", e);
                } catch (Throwable th2) {
                    th = th2;
                    jarFile = jarFile2;
                    if (jarFile != null) {
                        try {
                            jarFile.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static ArrayList<c> e(Context context) {
        String[] split = b(context.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList<c> arrayList = new ArrayList<>(split.length);
        for (String str : split) {
            int indexOf = str.indexOf(32);
            String[] split2 = str.substring(0, indexOf).split(":");
            boolean z10 = split2.length == 2 && indexOf > 0;
            String concat = str.length() != 0 ? "Invalid license meta-data line:\n".concat(str) : new String("Invalid license meta-data line:\n");
            if (z10) {
                arrayList.add(c.c(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1]), ""));
            } else {
                throw new IllegalStateException(String.valueOf(concat));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
