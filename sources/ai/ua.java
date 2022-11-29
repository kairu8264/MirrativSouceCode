package ai;

import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class ua {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<sa> f10662a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f10663b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str) {
        return "audio".equals(i(str));
    }

    public static boolean b(String str) {
        return "video".equals(i(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean c(String str, String str2) {
        char c10;
        ta h10;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (h10 = h(str2)) == null) {
                    return false;
                }
                int i10 = h10.f10205b;
                char c11 = i10 != 2 ? i10 != 5 ? i10 != 29 ? i10 != 42 ? i10 != 22 ? i10 != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                return (c11 == 0 || c11 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String d(String str) {
        ta h10;
        String a10 = tw2.a(str.trim());
        if (a10.startsWith("avc1") || a10.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (a10.startsWith("hev1") || a10.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (a10.startsWith("dvav") || a10.startsWith("dva1") || a10.startsWith("dvhe") || a10.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (a10.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (a10.startsWith("vp9") || a10.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (a10.startsWith("vp8") || a10.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        String str2 = null;
        if (a10.startsWith("mp4a")) {
            if (a10.startsWith("mp4a.") && (h10 = h(a10)) != null) {
                str2 = e(h10.f10204a);
            }
            return str2 == null ? MimeTypes.AUDIO_AAC : str2;
        } else if (a10.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (a10.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (a10.startsWith("ac-3") || a10.startsWith("dac3")) {
                return MimeTypes.AUDIO_AC3;
            }
            if (a10.startsWith("ec-3") || a10.startsWith("dec3")) {
                return MimeTypes.AUDIO_E_AC3;
            }
            if (a10.startsWith("ec+3")) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if (a10.startsWith("ac-4") || a10.startsWith("dac4")) {
                return MimeTypes.AUDIO_AC4;
            }
            if (a10.startsWith("dtsc")) {
                return MimeTypes.AUDIO_DTS;
            }
            if (a10.startsWith("dtse")) {
                return MimeTypes.AUDIO_DTS_EXPRESS;
            }
            if (a10.startsWith("dtsh") || a10.startsWith("dtsl")) {
                return MimeTypes.AUDIO_DTS_HD;
            }
            if (a10.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd";
            }
            if (a10.startsWith("opus")) {
                return MimeTypes.AUDIO_OPUS;
            }
            if (a10.startsWith("vorbis")) {
                return MimeTypes.AUDIO_VORBIS;
            }
            if (a10.startsWith("flac")) {
                return MimeTypes.AUDIO_FLAC;
            }
            if (a10.startsWith("stpp")) {
                return MimeTypes.APPLICATION_TTML;
            }
            if (a10.startsWith("wvtt")) {
                return MimeTypes.TEXT_VTT;
            }
            if (a10.contains("cea708")) {
                return MimeTypes.APPLICATION_CEA708;
            }
            if (a10.contains("eia608") || a10.contains("cea608")) {
                return MimeTypes.APPLICATION_CEA608;
            }
            int size = f10662a.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str3 = f10662a.get(i10).f9774b;
                if (a10.startsWith(null)) {
                    break;
                }
            }
            return null;
        }
    }

    public static String e(int i10) {
        if (i10 != 32) {
            if (i10 != 33) {
                if (i10 != 35) {
                    if (i10 != 64) {
                        if (i10 != 163) {
                            if (i10 != 177) {
                                if (i10 != 165) {
                                    if (i10 != 166) {
                                        switch (i10) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return MimeTypes.VIDEO_MPEG2;
                                            case 102:
                                            case 103:
                                            case 104:
                                                return MimeTypes.AUDIO_AAC;
                                            case 105:
                                            case 107:
                                                return MimeTypes.AUDIO_MPEG;
                                            case 106:
                                                return MimeTypes.VIDEO_MPEG;
                                            default:
                                                switch (i10) {
                                                    case 169:
                                                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                                                        return MimeTypes.AUDIO_DTS;
                                                    case 170:
                                                    case 171:
                                                        return MimeTypes.AUDIO_DTS_HD;
                                                    case 173:
                                                        return MimeTypes.AUDIO_OPUS;
                                                    case 174:
                                                        return MimeTypes.AUDIO_AC4;
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return MimeTypes.AUDIO_E_AC3;
                                }
                                return MimeTypes.AUDIO_AC3;
                            }
                            return MimeTypes.VIDEO_VP9;
                        }
                        return MimeTypes.VIDEO_VC1;
                    }
                    return MimeTypes.AUDIO_AAC;
                }
                return MimeTypes.VIDEO_H265;
            }
            return MimeTypes.VIDEO_H264;
        }
        return MimeTypes.VIDEO_MP4V;
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if ("text".equals(i(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        int size = f10662a.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = f10662a.get(i10).f9773a;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static String g(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? str : MimeTypes.AUDIO_WAV : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_FLAC;
    }

    public static ta h(String str) {
        Matcher matcher = f10663b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            String group2 = matcher.group(2);
            try {
                return new ta(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
