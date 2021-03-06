let repeat_string s n =
    String.concat "" (Array.to_list (Array.make n s))

let to_area h w =
    repeat_string ((repeat_string "#" w)  ^ "\n") h

let solve h w =
    Printf.printf "%s\n" (to_area h w)

let () =
    let rec loop () =
        let (h, w) = Scanf.scanf "%d %d\n" (fun h w -> (h, w)) in
        match (h, w) with
        | (0, 0) -> ()
        | (_, _) -> (
            solve h w ;
            loop () ;
        )
    in
    loop ()
