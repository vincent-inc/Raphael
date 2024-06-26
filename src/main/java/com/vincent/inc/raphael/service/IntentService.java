package com.vincent.inc.raphael.service;

import org.springframework.stereotype.Service;
import com.vincent.inc.raphael.dao.IntentDao;
import com.vincent.inc.raphael.model.Intent;
import com.vincent.inc.viesspringutils.service.ViesService;
import com.vincent.inc.viesspringutils.util.DatabaseCall;

@Service
public class IntentService extends ViesService<Intent, Integer, IntentDao>
{
    public IntentService(DatabaseCall<Intent, Integer> databaseCall, IntentDao repositoryDao) {
        super(databaseCall, repositoryDao);
    }

    @Override
    protected Intent newEmptyObject() {
        return new Intent();
    }
}