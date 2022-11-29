package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lk.w;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMasterPlaylist masterPlaylist;
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* loaded from: classes3.dex */
    public static final class DeltaUpdateException extends IOException {
    }

    /* loaded from: classes3.dex */
    public static class LineIterator {
        private final Queue<String> extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws IOException {
            String trim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String readLine = this.reader.readLine();
                this.next = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.next = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (hasNext()) {
                String str = this.next;
                this.next = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public HlsPlaylistParser() {
        this(HlsMasterPlaylist.EMPTY, null);
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int skipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (skipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i10)) {
                return false;
            }
            skipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, skipIgnorableWhitespace));
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(" + BOOLEAN_FALSE + "|" + BOOLEAN_TRUE + ")");
    }

    private static DrmInitData getPlaylistProtectionSchemes(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            schemeDataArr2[i10] = schemeDataArr[i10].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String getSegmentEncryptionIV(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static HlsMasterPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i10);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMasterPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i10);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMasterPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i10);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String parseStringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0));
        } else if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, TopicConstant.PACKET_TYPE_HLS, Util.getUtf8Bytes(str));
        } else {
            if (KEYFORMAT_PLAYREADY.equals(str2) && IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(parseOptionalStringAttr)) {
                String parseStringAttr2 = parseStringAttr(str, REGEX_URI, map);
                byte[] decode = Base64.decode(parseStringAttr2.substring(parseStringAttr2.indexOf(44)), 0);
                UUID uuid = C.PLAYREADY_UUID;
                return new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, PsshAtomUtil.buildPsshAtom(uuid, decode));
            }
            return null;
        }
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    private static HlsMasterPlaylist parseMasterPlaylist(LineIterator lineIterator, String str) throws IOException {
        Uri uri;
        char c10;
        Format format;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        boolean z10;
        int i10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i11;
        int i12;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Uri resolveToUri;
        HashMap hashMap;
        int i13;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            boolean hasNext = lineIterator.hasNext();
            String str6 = MimeTypes.APPLICATION_M3U8;
            if (hasNext) {
                String next = lineIterator.next();
                if (next.startsWith(TAG_PREFIX)) {
                    arrayList18.add(next);
                }
                boolean startsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
                boolean z13 = z11;
                if (next.startsWith(TAG_DEFINE)) {
                    hashMap3.put(parseStringAttr(next, REGEX_NAME, hashMap3), parseStringAttr(next, REGEX_VALUE, hashMap3));
                } else {
                    if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                        hashMap = hashMap2;
                        arrayList10 = arrayList16;
                        arrayList9 = arrayList12;
                        arrayList8 = arrayList13;
                        arrayList7 = arrayList14;
                        arrayList5 = arrayList15;
                        arrayList6 = arrayList18;
                        arrayList4 = arrayList17;
                        z11 = true;
                    } else if (next.startsWith(TAG_MEDIA)) {
                        arrayList16.add(next);
                    } else if (next.startsWith(TAG_SESSION_KEY)) {
                        DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, hashMap3), hashMap3);
                        if (parseDrmSchemeData != null) {
                            arrayList17.add(new DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, hashMap3)), parseDrmSchemeData));
                        }
                    } else if (next.startsWith(TAG_STREAM_INF) || startsWith) {
                        boolean contains = z12 | next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                        if (startsWith) {
                            i10 = 16384;
                            z10 = contains;
                        } else {
                            z10 = contains;
                            i10 = 0;
                        }
                        int parseIntAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                        arrayList4 = arrayList17;
                        arrayList5 = arrayList15;
                        int parseOptionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                        String parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_CODECS, hashMap3);
                        arrayList6 = arrayList18;
                        String parseOptionalStringAttr2 = parseOptionalStringAttr(next, REGEX_RESOLUTION, hashMap3);
                        if (parseOptionalStringAttr2 != null) {
                            arrayList7 = arrayList14;
                            String[] split = Util.split(parseOptionalStringAttr2, "x");
                            int parseInt2 = Integer.parseInt(split[0]);
                            int parseInt3 = Integer.parseInt(split[1]);
                            if (parseInt2 <= 0 || parseInt3 <= 0) {
                                parseInt3 = -1;
                                i13 = -1;
                            } else {
                                i13 = parseInt2;
                            }
                            i12 = parseInt3;
                            i11 = i13;
                        } else {
                            arrayList7 = arrayList14;
                            i11 = -1;
                            i12 = -1;
                        }
                        arrayList8 = arrayList13;
                        String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, hashMap3);
                        arrayList9 = arrayList12;
                        float parseFloat = parseOptionalStringAttr3 != null ? Float.parseFloat(parseOptionalStringAttr3) : -1.0f;
                        String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_VIDEO, hashMap3);
                        arrayList10 = arrayList16;
                        String parseOptionalStringAttr5 = parseOptionalStringAttr(next, REGEX_AUDIO, hashMap3);
                        HashMap hashMap4 = hashMap2;
                        String parseOptionalStringAttr6 = parseOptionalStringAttr(next, REGEX_SUBTITLES, hashMap3);
                        String parseOptionalStringAttr7 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, hashMap3);
                        if (startsWith) {
                            resolveToUri = UriUtil.resolveToUri(str5, parseStringAttr(next, REGEX_URI, hashMap3));
                        } else if (lineIterator.hasNext()) {
                            resolveToUri = UriUtil.resolveToUri(str5, replaceVariableReferences(lineIterator.next(), hashMap3));
                        } else {
                            throw new ParserException("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        arrayList11.add(new HlsMasterPlaylist.Variant(resolveToUri, new Format.Builder().setId(arrayList11.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(parseOptionalStringAttr).setAverageBitrate(parseOptionalIntAttr).setPeakBitrate(parseIntAttr).setWidth(i11).setHeight(i12).setFrameRate(parseFloat).setRoleFlags(i10).build(), parseOptionalStringAttr4, parseOptionalStringAttr5, parseOptionalStringAttr6, parseOptionalStringAttr7));
                        hashMap = hashMap4;
                        ArrayList arrayList19 = (ArrayList) hashMap.get(resolveToUri);
                        if (arrayList19 == null) {
                            arrayList19 = new ArrayList();
                            hashMap.put(resolveToUri, arrayList19);
                        }
                        arrayList19.add(new HlsTrackMetadataEntry.VariantInfo(parseOptionalIntAttr, parseIntAttr, parseOptionalStringAttr4, parseOptionalStringAttr5, parseOptionalStringAttr6, parseOptionalStringAttr7));
                        z11 = z13;
                        z12 = z10;
                    }
                    hashMap2 = hashMap;
                    arrayList17 = arrayList4;
                    arrayList15 = arrayList5;
                    arrayList18 = arrayList6;
                    arrayList14 = arrayList7;
                    arrayList13 = arrayList8;
                    arrayList12 = arrayList9;
                    arrayList16 = arrayList10;
                    str5 = str;
                }
                hashMap = hashMap2;
                arrayList10 = arrayList16;
                arrayList9 = arrayList12;
                arrayList8 = arrayList13;
                arrayList7 = arrayList14;
                arrayList5 = arrayList15;
                arrayList6 = arrayList18;
                arrayList4 = arrayList17;
                z11 = z13;
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            } else {
                HashMap hashMap5 = hashMap2;
                ArrayList arrayList20 = arrayList16;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList13;
                ArrayList arrayList23 = arrayList14;
                ArrayList arrayList24 = arrayList15;
                ArrayList arrayList25 = arrayList18;
                boolean z14 = z11;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i14 = 0;
                while (true) {
                    uri = null;
                    if (i14 >= arrayList11.size()) {
                        break;
                    }
                    HlsMasterPlaylist.Variant variant = (HlsMasterPlaylist.Variant) arrayList11.get(i14);
                    if (hashSet.add(variant.url)) {
                        Assertions.checkState(variant.format.metadata == null);
                        arrayList27.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) hashMap5.get(variant.url))))).build()));
                    }
                    i14++;
                }
                ArrayList arrayList28 = null;
                Format format2 = null;
                int i15 = 0;
                while (i15 < arrayList20.size()) {
                    ArrayList arrayList29 = arrayList20;
                    String str7 = (String) arrayList29.get(i15);
                    String parseStringAttr = parseStringAttr(str7, REGEX_GROUP_ID, hashMap3);
                    String parseStringAttr2 = parseStringAttr(str7, REGEX_NAME, hashMap3);
                    Format.Builder language = new Format.Builder().setId(parseStringAttr + ":" + parseStringAttr2).setLabel(parseStringAttr2).setContainerMimeType(str6).setSelectionFlags(parseSelectionFlags(str7)).setRoleFlags(parseRoleFlags(str7, hashMap3)).setLanguage(parseOptionalStringAttr(str7, REGEX_LANGUAGE, hashMap3));
                    String parseOptionalStringAttr8 = parseOptionalStringAttr(str7, REGEX_URI, hashMap3);
                    Uri resolveToUri2 = parseOptionalStringAttr8 == null ? uri : UriUtil.resolveToUri(str, parseOptionalStringAttr8);
                    arrayList20 = arrayList29;
                    String str8 = str6;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(parseStringAttr, parseStringAttr2, Collections.emptyList()));
                    String parseStringAttr3 = parseStringAttr(str7, REGEX_TYPE, hashMap3);
                    parseStringAttr3.hashCode();
                    switch (parseStringAttr3.hashCode()) {
                        case -959297733:
                            if (parseStringAttr3.equals(TYPE_SUBTITLES)) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333210994:
                            if (parseStringAttr3.equals(TYPE_CLOSED_CAPTIONS)) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62628790:
                            if (parseStringAttr3.equals(TYPE_AUDIO)) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 81665115:
                            if (parseStringAttr3.equals(TYPE_VIDEO)) {
                                c10 = 3;
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
                            format = format2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            HlsMasterPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList11, parseStringAttr);
                            if (variantWithSubtitleGroup != null) {
                                String codecsOfType = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                                language.setCodecs(codecsOfType);
                                str2 = MimeTypes.getMediaMimeType(codecsOfType);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = MimeTypes.TEXT_VTT;
                            }
                            language.setSampleMimeType(str2).setMetadata(metadata);
                            if (resolveToUri2 != null) {
                                arrayList3 = arrayList23;
                                arrayList3.add(new HlsMasterPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                                break;
                            } else {
                                arrayList3 = arrayList23;
                                Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            format = format2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            String parseStringAttr4 = parseStringAttr(str7, REGEX_INSTREAM_ID, hashMap3);
                            if (parseStringAttr4.startsWith("CC")) {
                                parseInt = Integer.parseInt(parseStringAttr4.substring(2));
                                str3 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                parseInt = Integer.parseInt(parseStringAttr4.substring(7));
                                str3 = MimeTypes.APPLICATION_CEA708;
                            }
                            if (arrayList28 == null) {
                                arrayList28 = new ArrayList();
                            }
                            language.setSampleMimeType(str3).setAccessibilityChannel(parseInt);
                            arrayList28.add(language.build());
                            arrayList3 = arrayList23;
                            break;
                        case 2:
                            arrayList2 = arrayList21;
                            HlsMasterPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList11, parseStringAttr);
                            if (variantWithAudioGroup != null) {
                                format = format2;
                                String codecsOfType2 = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                                language.setCodecs(codecsOfType2);
                                str4 = MimeTypes.getMediaMimeType(codecsOfType2);
                            } else {
                                format = format2;
                                str4 = null;
                            }
                            String parseOptionalStringAttr9 = parseOptionalStringAttr(str7, REGEX_CHANNELS, hashMap3);
                            if (parseOptionalStringAttr9 != null) {
                                language.setChannelCount(Integer.parseInt(Util.splitAtFirst(parseOptionalStringAttr9, "/")[0]));
                                if (MimeTypes.AUDIO_E_AC3.equals(str4) && parseOptionalStringAttr9.endsWith("/JOC")) {
                                    str4 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            language.setSampleMimeType(str4);
                            if (resolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList = arrayList22;
                                arrayList.add(new HlsMasterPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                            } else {
                                arrayList = arrayList22;
                                if (variantWithAudioGroup != null) {
                                    format = language.build();
                                }
                            }
                            arrayList3 = arrayList23;
                            break;
                        case 3:
                            HlsMasterPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList11, parseStringAttr);
                            if (variantWithVideoGroup != null) {
                                Format format3 = variantWithVideoGroup.format;
                                String codecsOfType3 = Util.getCodecsOfType(format3.codecs, 2);
                                language.setCodecs(codecsOfType3).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType3)).setWidth(format3.width).setHeight(format3.height).setFrameRate(format3.frameRate);
                            }
                            if (resolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList2 = arrayList21;
                                arrayList2.add(new HlsMasterPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                                format = format2;
                                arrayList3 = arrayList23;
                                arrayList = arrayList22;
                                break;
                            }
                        default:
                            format = format2;
                            arrayList3 = arrayList23;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            break;
                    }
                    i15++;
                    arrayList23 = arrayList3;
                    arrayList22 = arrayList;
                    arrayList21 = arrayList2;
                    str6 = str8;
                    format2 = format;
                    uri = null;
                }
                return new HlsMasterPlaylist(str, arrayList25, arrayList27, arrayList21, arrayList22, arrayList23, arrayList24, format2, z12 ? Collections.emptyList() : arrayList28, z14, hashMap3, arrayList26);
            }
        }
    }

    private static HlsMediaPlaylist parseMediaPlaylist(HlsMasterPlaylist hlsMasterPlaylist, HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) throws IOException {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str2;
        HlsMediaPlaylist.Part part;
        String str3;
        long j10;
        boolean z11;
        int i10;
        HashMap hashMap;
        ArrayList arrayList3;
        boolean z12;
        String str4;
        HashMap hashMap2;
        long j11;
        String str5;
        boolean z13;
        DrmInitData drmInitData;
        long j12;
        HlsMasterPlaylist hlsMasterPlaylist2 = hlsMasterPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        boolean z14 = hlsMasterPlaylist2.hasIndependentSegments;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl = new HlsMediaPlaylist.ServerControl(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap = new TreeMap();
        String str6 = "";
        boolean z15 = false;
        boolean z16 = z14;
        HlsMediaPlaylist.ServerControl serverControl2 = serverControl;
        String str7 = "";
        boolean z17 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z18 = false;
        boolean z19 = false;
        int i13 = 0;
        boolean z20 = false;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = C.TIME_UNSET;
        int i14 = 1;
        long j22 = C.TIME_UNSET;
        long j23 = C.TIME_UNSET;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        HlsMediaPlaylist.Part part2 = null;
        String str8 = null;
        long j24 = -1;
        String str9 = null;
        String str10 = null;
        HlsMediaPlaylist.Segment segment = null;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList6.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                String parseStringAttr = parseStringAttr(next, REGEX_PLAYLIST_TYPE, hashMap3);
                if ("VOD".equals(parseStringAttr)) {
                    i11 = 1;
                } else if ("EVENT".equals(parseStringAttr)) {
                    i11 = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                z20 = true;
            } else if (next.startsWith(TAG_START)) {
                j21 = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
            } else if (next.startsWith(TAG_SERVER_CONTROL)) {
                serverControl2 = parseServerControl(next);
            } else if (next.startsWith(TAG_PART_INF)) {
                j23 = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
            } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                String parseStringAttr2 = parseStringAttr(next, REGEX_URI, hashMap3);
                String parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap3);
                if (parseOptionalStringAttr != null) {
                    String[] split = Util.split(parseOptionalStringAttr, "@");
                    j24 = Long.parseLong(split[z15 ? 1 : 0]);
                    if (split.length > 1) {
                        j15 = Long.parseLong(split[1]);
                    }
                }
                int i15 = (j24 > (-1L) ? 1 : (j24 == (-1L) ? 0 : -1));
                if (i15 == 0) {
                    j15 = 0;
                }
                String str11 = str8;
                String str12 = str9;
                if (str11 != null && str12 == null) {
                    throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                }
                segment = new HlsMediaPlaylist.Segment(parseStringAttr2, j15, j24, str11, str12);
                if (i15 != 0) {
                    j15 += j24;
                }
                str8 = str11;
                str9 = str12;
                j24 = -1;
            } else {
                String str13 = str8;
                String str14 = str9;
                if (next.startsWith(TAG_TARGET_DURATION)) {
                    j22 = 1000000 * parseIntAttr(next, REGEX_TARGET_DURATION);
                } else if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                    j18 = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                    str8 = str13;
                    j14 = j18;
                    str9 = str14;
                    z15 = false;
                } else if (next.startsWith(TAG_VERSION)) {
                    i14 = parseIntAttr(next, REGEX_VERSION);
                } else {
                    if (next.startsWith(TAG_DEFINE)) {
                        String parseOptionalStringAttr2 = parseOptionalStringAttr(next, REGEX_IMPORT, hashMap3);
                        if (parseOptionalStringAttr2 != null) {
                            String str15 = hlsMasterPlaylist2.variableDefinitions.get(parseOptionalStringAttr2);
                            if (str15 != null) {
                                hashMap3.put(parseOptionalStringAttr2, str15);
                            }
                        } else {
                            hashMap3.put(parseStringAttr(next, REGEX_NAME, hashMap3), parseStringAttr(next, REGEX_VALUE, hashMap3));
                        }
                        arrayList2 = arrayList6;
                        str2 = str6;
                        part = part2;
                        str3 = str10;
                        j10 = j18;
                        z11 = z17;
                        i10 = i11;
                        hashMap = hashMap5;
                        arrayList3 = arrayList4;
                    } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                        str7 = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str6, hashMap3);
                        hlsMasterPlaylist2 = hlsMasterPlaylist;
                        j19 = (long) (parseDoubleAttr(next, REGEX_MEDIA_DURATION) * 1000000.0d);
                    } else {
                        if (next.startsWith(TAG_SKIP)) {
                            int parseIntAttr = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                            Assertions.checkState(hlsMediaPlaylist2 != null && arrayList4.isEmpty());
                            int i16 = (int) (j14 - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist)).mediaSequence);
                            int i17 = parseIntAttr + i16;
                            if (i16 < 0 || i17 > hlsMediaPlaylist2.segments.size()) {
                                throw new DeltaUpdateException();
                            }
                            long j25 = j17;
                            str9 = str14;
                            while (i16 < i17) {
                                HlsMediaPlaylist.Segment segment2 = hlsMediaPlaylist2.segments.get(i16);
                                ArrayList arrayList7 = arrayList6;
                                String str16 = str6;
                                if (j14 != hlsMediaPlaylist2.mediaSequence) {
                                    segment2 = segment2.copyWith(j25, (hlsMediaPlaylist2.discontinuitySequence - i12) + segment2.relativeDiscontinuitySequence);
                                }
                                arrayList4.add(segment2);
                                j25 += segment2.durationUs;
                                long j26 = segment2.byteRangeLength;
                                int i18 = i17;
                                if (j26 != -1) {
                                    j15 = segment2.byteRangeOffset + j26;
                                }
                                int i19 = segment2.relativeDiscontinuitySequence;
                                HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                                DrmInitData drmInitData4 = segment2.drmInitData;
                                String str17 = segment2.fullSegmentEncryptionKeyUri;
                                String str18 = segment2.encryptionIV;
                                if (str18 == null || !str18.equals(Long.toHexString(j18))) {
                                    str9 = segment2.encryptionIV;
                                }
                                j18++;
                                i16++;
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                str13 = str17;
                                j16 = j25;
                                i13 = i19;
                                i17 = i18;
                                segment = segment3;
                                str6 = str16;
                                drmInitData3 = drmInitData4;
                                arrayList6 = arrayList7;
                            }
                            hlsMasterPlaylist2 = hlsMasterPlaylist;
                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                            j17 = j25;
                            str8 = str13;
                        } else {
                            arrayList2 = arrayList6;
                            str2 = str6;
                            if (next.startsWith(TAG_KEY)) {
                                String parseStringAttr3 = parseStringAttr(next, REGEX_METHOD, hashMap3);
                                String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, hashMap3);
                                if (METHOD_NONE.equals(parseStringAttr3)) {
                                    treeMap.clear();
                                    str4 = null;
                                    drmInitData3 = null;
                                    str9 = null;
                                } else {
                                    String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_IV, hashMap3);
                                    if (KEYFORMAT_IDENTITY.equals(parseOptionalStringAttr3)) {
                                        if (METHOD_AES_128.equals(parseStringAttr3)) {
                                            str4 = parseStringAttr(next, REGEX_URI, hashMap3);
                                            str9 = parseOptionalStringAttr4;
                                        }
                                        str9 = parseOptionalStringAttr4;
                                        str4 = null;
                                    } else {
                                        String str19 = str10;
                                        str10 = str19 == null ? parseEncryptionScheme(parseStringAttr3) : str19;
                                        DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr3, hashMap3);
                                        if (parseDrmSchemeData != null) {
                                            treeMap.put(parseOptionalStringAttr3, parseDrmSchemeData);
                                            str9 = parseOptionalStringAttr4;
                                            str4 = null;
                                            drmInitData3 = null;
                                        }
                                        str9 = parseOptionalStringAttr4;
                                        str4 = null;
                                    }
                                }
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                str8 = str4;
                                arrayList6 = arrayList2;
                                str6 = str2;
                                z15 = false;
                            } else {
                                str3 = str10;
                                if (next.startsWith(TAG_BYTERANGE)) {
                                    String[] split2 = Util.split(parseStringAttr(next, REGEX_BYTERANGE, hashMap3), "@");
                                    j24 = Long.parseLong(split2[0]);
                                    if (split2.length > 1) {
                                        j15 = Long.parseLong(split2[1]);
                                    }
                                } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                    i12 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                    str10 = str3;
                                    str8 = str13;
                                    str9 = str14;
                                    arrayList6 = arrayList2;
                                    str6 = str2;
                                    z17 = true;
                                } else if (next.equals(TAG_DISCONTINUITY)) {
                                    i13++;
                                } else {
                                    if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                        if (j13 == 0) {
                                            j13 = C.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j17;
                                        } else {
                                            z11 = z17;
                                            arrayList3 = arrayList4;
                                            part = part2;
                                            j10 = j18;
                                            z12 = false;
                                        }
                                    } else if (next.equals(TAG_GAP)) {
                                        hlsMasterPlaylist2 = hlsMasterPlaylist;
                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                        str10 = str3;
                                        str8 = str13;
                                        str9 = str14;
                                        arrayList6 = arrayList2;
                                        str6 = str2;
                                        z15 = false;
                                        z19 = true;
                                    } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                        hlsMasterPlaylist2 = hlsMasterPlaylist;
                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                        str10 = str3;
                                        str8 = str13;
                                        str9 = str14;
                                        arrayList6 = arrayList2;
                                        str6 = str2;
                                        z15 = false;
                                        z16 = true;
                                    } else if (next.equals(TAG_ENDLIST)) {
                                        hlsMasterPlaylist2 = hlsMasterPlaylist;
                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                        str10 = str3;
                                        str8 = str13;
                                        str9 = str14;
                                        arrayList6 = arrayList2;
                                        str6 = str2;
                                        z15 = false;
                                        z18 = true;
                                    } else if (next.startsWith(TAG_RENDITION_REPORT)) {
                                        long parseOptionalLongAttr = parseOptionalLongAttr(next, REGEX_LAST_MSN, (j14 + arrayList4.size()) - (arrayList5.isEmpty() ? 1L : 0L));
                                        int parseOptionalIntAttr = parseOptionalIntAttr(next, REGEX_LAST_PART, j23 != C.TIME_UNSET ? (arrayList5.isEmpty() ? ((HlsMediaPlaylist.Segment) w.c(arrayList4)).parts : arrayList5).size() - 1 : -1);
                                        Uri parse = Uri.parse(UriUtil.resolve(str, parseStringAttr(next, REGEX_URI, hashMap3)));
                                        hashMap5.put(parse, new HlsMediaPlaylist.RenditionReport(parse, parseOptionalLongAttr, parseOptionalIntAttr));
                                        z11 = z17;
                                        arrayList3 = arrayList4;
                                        part = part2;
                                        j10 = j18;
                                        z12 = false;
                                    } else if (next.startsWith(TAG_PRELOAD_HINT)) {
                                        part = part2;
                                        if (part == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, hashMap3))) {
                                            String parseStringAttr4 = parseStringAttr(next, REGEX_URI, hashMap3);
                                            long parseOptionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L);
                                            long parseOptionalLongAttr3 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L);
                                            long j27 = j18;
                                            String segmentEncryptionIV = getSegmentEncryptionIV(j27, str13, str14);
                                            if (drmInitData3 != null || treeMap.isEmpty()) {
                                                hashMap2 = hashMap5;
                                            } else {
                                                hashMap2 = hashMap5;
                                                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                DrmInitData drmInitData5 = new DrmInitData(str3, schemeDataArr);
                                                if (drmInitData2 == null) {
                                                    drmInitData2 = getPlaylistProtectionSchemes(str3, schemeDataArr);
                                                }
                                                drmInitData3 = drmInitData5;
                                            }
                                            int i20 = (parseOptionalLongAttr2 > (-1L) ? 1 : (parseOptionalLongAttr2 == (-1L) ? 0 : -1));
                                            if (i20 == 0 || parseOptionalLongAttr3 != -1) {
                                                part = new HlsMediaPlaylist.Part(parseStringAttr4, segment, 0L, i13, j16, drmInitData3, str13, segmentEncryptionIV, i20 != 0 ? parseOptionalLongAttr2 : 0L, parseOptionalLongAttr3, false, false, true);
                                            }
                                            str9 = str14;
                                            str10 = str3;
                                            j18 = j27;
                                            str8 = str13;
                                            hashMap5 = hashMap2;
                                            arrayList6 = arrayList2;
                                            str6 = str2;
                                            z15 = false;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            part2 = part;
                                        } else {
                                            z11 = z17;
                                            hashMap = hashMap5;
                                            arrayList3 = arrayList4;
                                            j10 = j18;
                                            z12 = false;
                                            i10 = i11;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            str8 = str13;
                                            hashMap5 = hashMap;
                                            i11 = i10;
                                            str9 = str14;
                                            part2 = part;
                                            j18 = j10;
                                            z15 = z12;
                                            str6 = str2;
                                            hlsMasterPlaylist2 = hlsMasterPlaylist;
                                            arrayList4 = arrayList3;
                                            z17 = z11;
                                            str10 = str3;
                                            arrayList6 = arrayList2;
                                        }
                                    } else {
                                        part = part2;
                                        j10 = j18;
                                        hashMap = hashMap5;
                                        if (next.startsWith(TAG_PART)) {
                                            String segmentEncryptionIV2 = getSegmentEncryptionIV(j10, str13, str14);
                                            String parseStringAttr5 = parseStringAttr(next, REGEX_URI, hashMap3);
                                            ArrayList arrayList8 = arrayList4;
                                            long parseDoubleAttr = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                            boolean z21 = z17;
                                            int i21 = i11;
                                            boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z16 && arrayList5.isEmpty());
                                            boolean parseOptionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                            String parseOptionalStringAttr5 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap3);
                                            if (parseOptionalStringAttr5 != null) {
                                                String[] split3 = Util.split(parseOptionalStringAttr5, "@");
                                                j12 = Long.parseLong(split3[0]);
                                                if (split3.length > 1) {
                                                    j20 = Long.parseLong(split3[1]);
                                                }
                                            } else {
                                                j12 = -1;
                                            }
                                            int i22 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                                            if (i22 == 0) {
                                                j20 = 0;
                                            }
                                            if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                DrmInitData drmInitData6 = new DrmInitData(str3, schemeDataArr2);
                                                if (drmInitData2 == null) {
                                                    drmInitData2 = getPlaylistProtectionSchemes(str3, schemeDataArr2);
                                                }
                                                drmInitData3 = drmInitData6;
                                            }
                                            arrayList5.add(new HlsMediaPlaylist.Part(parseStringAttr5, segment, parseDoubleAttr, i13, j16, drmInitData3, str13, segmentEncryptionIV2, j20, j12, parseOptionalBooleanAttribute2, parseOptionalBooleanAttribute, false));
                                            j16 += parseDoubleAttr;
                                            if (i22 != 0) {
                                                j20 += j12;
                                            }
                                            str8 = str13;
                                            hashMap5 = hashMap;
                                            arrayList4 = arrayList8;
                                            z17 = z21;
                                            i11 = i21;
                                            part2 = part;
                                            str9 = str14;
                                            str10 = str3;
                                            j18 = j10;
                                            arrayList6 = arrayList2;
                                            str6 = str2;
                                            z15 = false;
                                            hlsMasterPlaylist2 = hlsMasterPlaylist;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                        } else {
                                            z11 = z17;
                                            i10 = i11;
                                            ArrayList arrayList9 = arrayList4;
                                            if (next.startsWith("#")) {
                                                str14 = str14;
                                                arrayList3 = arrayList9;
                                            } else {
                                                String segmentEncryptionIV3 = getSegmentEncryptionIV(j10, str13, str14);
                                                long j28 = j10 + 1;
                                                String replaceVariableReferences = replaceVariableReferences(next, hashMap3);
                                                HlsMediaPlaylist.Segment segment4 = (HlsMediaPlaylist.Segment) hashMap4.get(replaceVariableReferences);
                                                int i23 = (j24 > (-1L) ? 1 : (j24 == (-1L) ? 0 : -1));
                                                if (i23 == 0) {
                                                    j11 = 0;
                                                } else {
                                                    if (z20 && segment == null && segment4 == null) {
                                                        segment4 = new HlsMediaPlaylist.Segment(replaceVariableReferences, 0L, j15, null, null);
                                                        hashMap4.put(replaceVariableReferences, segment4);
                                                    }
                                                    j11 = j15;
                                                }
                                                if (drmInitData3 != null || treeMap.isEmpty()) {
                                                    str5 = str14;
                                                    z13 = false;
                                                    drmInitData = drmInitData3;
                                                } else {
                                                    str5 = str14;
                                                    z13 = false;
                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    drmInitData = new DrmInitData(str3, schemeDataArr3);
                                                    if (drmInitData2 == null) {
                                                        drmInitData2 = getPlaylistProtectionSchemes(str3, schemeDataArr3);
                                                    }
                                                }
                                                HlsMediaPlaylist.Segment segment5 = new HlsMediaPlaylist.Segment(replaceVariableReferences, segment != null ? segment : segment4, str7, j19, i13, j17, drmInitData, str13, segmentEncryptionIV3, j11, j24, z19, arrayList5);
                                                arrayList3 = arrayList9;
                                                arrayList3.add(segment5);
                                                j16 = j17 + j19;
                                                arrayList5 = new ArrayList();
                                                if (i23 != 0) {
                                                    j11 += j24;
                                                }
                                                j15 = j11;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                str8 = str13;
                                                drmInitData3 = drmInitData;
                                                z19 = z13;
                                                j19 = 0;
                                                j17 = j16;
                                                hashMap5 = hashMap;
                                                i11 = i10;
                                                str9 = str5;
                                                str7 = str2;
                                                j24 = -1;
                                                part2 = part;
                                                j18 = j28;
                                                z15 = z19;
                                                str6 = str7;
                                                hlsMasterPlaylist2 = hlsMasterPlaylist;
                                                arrayList4 = arrayList3;
                                                z17 = z11;
                                                str10 = str3;
                                                arrayList6 = arrayList2;
                                            }
                                        }
                                    }
                                    i10 = i11;
                                    hashMap = hashMap5;
                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                    str8 = str13;
                                    hashMap5 = hashMap;
                                    i11 = i10;
                                    str9 = str14;
                                    part2 = part;
                                    j18 = j10;
                                    z15 = z12;
                                    str6 = str2;
                                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                                    arrayList4 = arrayList3;
                                    z17 = z11;
                                    str10 = str3;
                                    arrayList6 = arrayList2;
                                }
                                hlsMasterPlaylist2 = hlsMasterPlaylist;
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                str10 = str3;
                                str8 = str13;
                                str9 = str14;
                                arrayList6 = arrayList2;
                                str6 = str2;
                            }
                            hlsMasterPlaylist2 = hlsMasterPlaylist;
                        }
                        z15 = false;
                    }
                    z12 = false;
                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                    str8 = str13;
                    hashMap5 = hashMap;
                    i11 = i10;
                    str9 = str14;
                    part2 = part;
                    j18 = j10;
                    z15 = z12;
                    str6 = str2;
                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                    arrayList4 = arrayList3;
                    z17 = z11;
                    str10 = str3;
                    arrayList6 = arrayList2;
                }
                str8 = str13;
                str9 = str14;
                z15 = false;
            }
        }
        boolean z22 = z17;
        int i24 = i11;
        ArrayList arrayList10 = arrayList6;
        ArrayList arrayList11 = arrayList4;
        HlsMediaPlaylist.Part part3 = part2;
        boolean z23 = z15 ? 1 : 0;
        HashMap hashMap6 = hashMap5;
        if (part3 != null) {
            arrayList5.add(part3);
        }
        if (j13 != 0) {
            arrayList = arrayList5;
            z10 = true;
        } else {
            arrayList = arrayList5;
            z10 = z23;
        }
        return new HlsMediaPlaylist(i24, str, arrayList10, j21, j13, z22, i12, j14, i14, j22, j23, z16, z18, z10, drmInitData2, arrayList11, arrayList, serverControl2, hashMap6);
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? BOOLEAN_TRUE.equals(matcher.group(1)) : z10;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1))) : d10;
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))) : i10;
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) : j10;
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(parseOptionalStringAttr)) {
            return 0;
        }
        String[] split = Util.split(parseOptionalStringAttr, ",");
        int i10 = Util.contains(split, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(split, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (Util.contains(split, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return Util.contains(split, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int parseSelectionFlags(String str) {
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r02 = parseOptionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r02 = (parseOptionalBooleanAttribute ? 1 : 0) | true;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r02 | 4 : r02;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double parseOptionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        int i10 = (parseOptionalDoubleAttr > (-9.223372036854776E18d) ? 1 : (parseOptionalDoubleAttr == (-9.223372036854776E18d) ? 0 : -1));
        long j10 = C.TIME_UNSET;
        long j11 = i10 == 0 ? -9223372036854775807L : (long) (parseOptionalDoubleAttr * 1000000.0d);
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double parseOptionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j12 = parseOptionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr2 * 1000000.0d);
        double parseOptionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        if (parseOptionalDoubleAttr3 != -9.223372036854776E18d) {
            j10 = (long) (parseOptionalDoubleAttr3 * 1000000.0d);
        }
        return new HlsMediaPlaylist.ServerControl(j11, parseOptionalBooleanAttribute, j12, j10, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (parseOptionalStringAttr != null) {
            return parseOptionalStringAttr;
        }
        throw new ParserException("Couldn't match " + pattern.pattern() + " in " + str);
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !Util.isLinebreak(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    public HlsPlaylistParser(HlsMasterPlaylist hlsMasterPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.masterPlaylist = hlsMasterPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (checkPlaylistHeader(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (trim.startsWith(TAG_STREAM_INF)) {
                                arrayDeque.add(trim);
                                return parseMasterPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                            } else if (trim.startsWith(TAG_TARGET_DURATION) || trim.startsWith(TAG_MEDIA_SEQUENCE) || trim.startsWith(TAG_MEDIA_DURATION) || trim.startsWith(TAG_KEY) || trim.startsWith(TAG_BYTERANGE) || trim.equals(TAG_DISCONTINUITY) || trim.equals(TAG_DISCONTINUITY_SEQUENCE) || trim.equals(TAG_ENDLIST)) {
                                break;
                            } else {
                                arrayDeque.add(trim);
                            }
                        }
                    } else {
                        Util.closeQuietly(bufferedReader);
                        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return parseMediaPlaylist(this.masterPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
            }
            throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
        } finally {
            Util.closeQuietly(bufferedReader);
        }
    }
}
