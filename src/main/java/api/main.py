from typing import Union
from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def read_root():
    return {"Hello": "World"}


@app.get("/greeting")
def read_name(name:str = "HI"):
    name=name
    if name == "":
        name="HI"
    return name