package com.yousdi.service;

import com.yousdi.entity.Process;
import java.util.List;

public interface ProcessService {
    List<Process> process();

    Process getProcessById(Integer var1);

    void addProcess(Process var1);

    void updateProcess(Process var1);

    void deleteProcess(Integer var1);
}
