package com.vpedak.testsrecorder.core;

import com.vpedak.testsrecorder.core.events.*;

import java.util.List;

public interface TestGenerator {
    String generate(String activityClassName, String testClassName, String packageName, List<RecordingEvent> events);

    void generateEvent(StringBuilder sb, RecordingEvent event);

    void generateSubject(StringBuilder sb, Subject subject);
    void generateSubject(StringBuilder sb, View subject);
    void generateSubject(StringBuilder sb, OptionsMenu subject);
    void generateSubject(StringBuilder sb, MenuItem subject);
    void generateSubject(StringBuilder sb, Data subject);

    void generateActon(StringBuilder sb, Action action, Subject subject);
    void generateActon(StringBuilder sb, ClickAction action, Subject subject);
    void generateActon(StringBuilder sb, LongClickAction action, Subject subject);
    void generateActon(StringBuilder sb, ReplaceTextAction action, Subject subject);
}
