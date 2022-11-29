package ai;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class qx3 {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9232a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f9233b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f9234c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static mx3 a(String str) throws IOException {
        long j10;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (tb.b(newPullParser, "x:xmpmeta")) {
                zz2<lx3> r10 = zz2.r();
                long j11 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (tb.b(newPullParser, "rdf:Description")) {
                        String[] strArr = f9232a;
                        int i10 = 0;
                        for (int i11 = 0; i11 < 4; i11++) {
                            String c10 = tb.c(newPullParser, strArr[i11]);
                            if (c10 != null) {
                                if (Integer.parseInt(c10) != 1) {
                                    return null;
                                } else {
                                    String[] strArr2 = f9233b;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= 4) {
                                            break;
                                        }
                                        String c11 = tb.c(newPullParser, strArr2[i12]);
                                        if (c11 != null) {
                                            j10 = Long.parseLong(c11);
                                            if (j10 == -1) {
                                            }
                                        } else {
                                            i12++;
                                        }
                                    }
                                    j10 = -9223372036854775807L;
                                    String[] strArr3 = f9234c;
                                    while (true) {
                                        if (i10 < 2) {
                                            String c12 = tb.c(newPullParser, strArr3[i10]);
                                            if (c12 != null) {
                                                r10 = zz2.t(new lx3(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new lx3(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(c12), 0L));
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            r10 = zz2.r();
                                            break;
                                        }
                                    }
                                    j11 = j10;
                                }
                            }
                        }
                        return null;
                    } else if (tb.b(newPullParser, "Container:Directory")) {
                        r10 = b(newPullParser, "Container", "Item");
                    } else if (tb.b(newPullParser, "GContainer:Directory")) {
                        r10 = b(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!tb.a(newPullParser, "x:xmpmeta"));
                if (r10.isEmpty()) {
                    return null;
                }
                return new mx3(j11, r10);
            }
            throw zzaha.b("Couldn't find xmp metadata", null);
        } catch (zzaha | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static zz2<lx3> b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        wz2 K = zz2.K();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (tb.b(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String c10 = tb.c(xmlPullParser, concat3);
                String c11 = tb.c(xmlPullParser, concat4);
                String c12 = tb.c(xmlPullParser, concat5);
                String c13 = tb.c(xmlPullParser, concat6);
                if (c10 != null && c11 != null) {
                    K.f(new lx3(c10, c11, c12 != null ? Long.parseLong(c12) : 0L, c13 != null ? Long.parseLong(c13) : 0L));
                } else {
                    return zz2.r();
                }
            }
        } while (!tb.a(xmlPullParser, concat2));
        return K.g();
    }
}
