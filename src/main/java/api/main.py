from fastapi import FastAPI
from typing import List

app = FastAPI()

# 이름 저장을 위한 스택
names = []

@app.get("/greeting", response_model=List[str])
async def greeting(name: str = "HI"):
    names.append(name)
    return names