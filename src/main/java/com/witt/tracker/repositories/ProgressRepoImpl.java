package com.witt.tracker.repositories;

import com.witt.tracker.entities.Progress;

public abstract class ProgressRepoImpl implements ProgressRepository {

	@Override
	public void delete(Progress entity) {
		if (findBy(entity.getId()) != null) {
			delete(entity.getId());
		}
	}

}
