package f3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e3.e;
import java.io.IOException;
import java.io.InputStream;
import l3.f;

/* loaded from: classes.dex */
public class j extends k {
    @Override // f3.k
    public Typeface b(Context context, e.b bVar, Resources resources, int i10) {
        try {
            e.c[] a10 = bVar.a();
            int length = a10.length;
            FontFamily.Builder builder = null;
            int i11 = 0;
            while (true) {
                int i12 = 1;
                if (i11 >= length) {
                    break;
                }
                e.c cVar = a10[i11];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.b()).setWeight(cVar.e());
                    if (!cVar.f()) {
                        i12 = 0;
                    }
                    Font build = weight.setSlant(i12).setTtcIndex(cVar.c()).setFontVariationSettings(cVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i11++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // f3.k
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            FontFamily.Builder builder = null;
            int i11 = 0;
            while (true) {
                int i12 = 1;
                if (i11 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0)).build();
                }
                f.b bVar = bVarArr[i11];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), TopicConstant.EXTEND_AAC_RAW, cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.e());
                        if (!bVar.f()) {
                            i12 = 0;
                        }
                        Font build = weight.setSlant(i12).setTtcIndex(bVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                    i11++;
                }
                openFileDescriptor.close();
                i11++;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // f3.k
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // f3.k
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // f3.k
    public f.b h(f.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
