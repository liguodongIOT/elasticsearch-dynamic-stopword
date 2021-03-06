package com.liguodong.elasticsearch.plugin.stopword.analysis.file;

import org.apache.lucene.analysis.util.CharArraySet;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;

import java.util.List;

/**
 * Describe:
 * author: guodong.li
 * datetime: 2017/7/14 10:28
 */
public interface StopwordFile {

    ESLogger LOGGER = Loggers.getLogger("dynamic-stopword");

    //重新加载停止词
    CharArraySet reloadStopwordSet();

    //判断是否需要重新加载
    boolean isNeedReloadStopwordSet();

    //读取文件
    List<String> readFile();

}
